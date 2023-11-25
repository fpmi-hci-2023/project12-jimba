package by.bsu.jimba.services;

import by.bsu.jimba.domain.models.bindingModels.post.PostCreateBindingModel;
import by.bsu.jimba.domain.models.serviceModels.PostServiceModel;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface PostService {
    boolean createPost(PostCreateBindingModel postCreateBindingModel) throws Exception;

    List<PostServiceModel> getAllPosts(String timelineUserId);

    CompletableFuture<Boolean> deletePost(String loggedInUserId, String postToRemoveId) throws Exception;
}
