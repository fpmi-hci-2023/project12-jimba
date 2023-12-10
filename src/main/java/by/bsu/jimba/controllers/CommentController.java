package by.bsu.jimba.controllers;

import by.bsu.jimba.domain.models.bindingModels.comment.CommentCreateBindingModel;
import by.bsu.jimba.services.CommentService;
import by.bsu.jimba.utils.constants.ResponseMessageConstants;
import by.bsu.jimba.utils.responseHandler.exceptions.CustomException;
import by.bsu.jimba.utils.responseHandler.successResponse.SuccessResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static by.bsu.jimba.utils.constants.ResponseMessageConstants.*;


@Tag(name = "Comment", description = "The Comment API")
@RestController()
@RequestMapping(value = "/comment")
public class CommentController {

    private final CommentService commentService;
    private final ObjectMapper objectMapper;

    @Autowired
    public CommentController( CommentService commentService, ObjectMapper objectMapper) {
        this.commentService = commentService;
        this.objectMapper = objectMapper;
    }

    @Operation(summary = "create comment", tags = "comment")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Create comment"
            )
    })
    @PostMapping(value = "/create")
    public ResponseEntity<Object> createComment(@RequestBody @Valid CommentCreateBindingModel commentCreateBindingModel) throws Exception {
        boolean comment = this.commentService.createComment(commentCreateBindingModel);
        if (comment) {
            SuccessResponse successResponse = new SuccessResponse(LocalDateTime.now(), SUCCESSFUL_CREATE_COMMENT_MESSAGE, "", true);
            return new ResponseEntity<>(this.objectMapper.writeValueAsString(successResponse), HttpStatus.OK);
        }
        throw new CustomException(SERVER_ERROR_MESSAGE);
    }

    @PostMapping(value = "/remove")
    public ResponseEntity removeComment(@RequestBody Map<String, Object> body) throws Exception {
        String loggedInUserId = (String) body.get("loggedInUserId");
        String commentToRemoveId = (String) body.get("commentToRemoveId");

        CompletableFuture<Boolean> result = this.commentService.deleteComment(loggedInUserId, commentToRemoveId);
        if (result.get()) {
            SuccessResponse successResponse = new SuccessResponse(LocalDateTime.now(), SUCCESSFUL_DELETE_COMMENT_MESSAGE, "", true);
            return new ResponseEntity<>(this.objectMapper.writeValueAsString(successResponse), HttpStatus.OK);
        }
        throw new CustomException(ResponseMessageConstants.SERVER_ERROR_MESSAGE);
    }
}
