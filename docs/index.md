### Welcome to our silly documentation for the Jimba project! 

 Probably, none of us will enjoy it but anyways let's take a look of what we have here...

## [Home](index.md)
**Jimba** is a social network that will help you to keep in touch with your friends and sharing with them what's on your mind!

- [Additional specification](#additional-specification)
- [API](#api)
- [Database scheme](#database-scheme)
- [Functional requirements](#functional-requirements)
- [Static Structure diagram](#static-structure-diagram)
- [Presentation](#presentation)

----

## Additional specification
**Security**

Implemented with Spring Security

<img width="871" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/aa98f9bd-2479-4a90-9866-c4d870e9de18">

After authorization the user is given a JWT token in cookie file and when moving to the next component, access to the component is determined depending on the user whose data is in the token

## API
### Controller with swagger documentation:

<img width="622" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/e2579fc5-8dfd-4084-8db9-47ce6f231761">

Result in postman of the method above:

<img width="622" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/e67c851c-cdd8-490f-be21-022bf7f6d657">

### Controller for registration users:

<img width="621" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/0ee08465-f07d-4277-b030-33e4cb486472">

### Controller with post operation:

<img width="620" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/eba3dd3f-c513-45bc-bdcf-c50721c29b77">

### Controller with message operation:

<img width="619" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/a7687813-cda8-462a-a130-71d132161008">

**Postman'n result of the methods above:**
<p>User registration</p>
<img width="1031" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/7e9d5ed7-d588-4884-b731-57adbb3fc941">

<p>Login</p>
<img width="1032" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/d062dc01-45cc-4e01-bcd1-27381462ba2e">

## Database scheme
<img width="951" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/df52823d-4ff9-48e4-9d3d-bba59ff0c704">

SQL dump script:
[SQL](https://pastebin.com/QaJY9WWA)

## Functional requirements

What you can do:
- find friends
- chat with a friend
- post something
- post pictures

Here are some of ours use case diagrams (main functions for default user):

![](https://github.com/fpmi-hci-2023/project12-jimba/assets/76448401/dfbe9d9e-f22d-46d4-a4b4-d97e2c6b1526)

![](https://github.com/fpmi-hci-2023/project12-jimba/assets/76448401/58548574-0710-43f2-8704-2121914d82a0)

## Static Structure diagram

<img width="895" alt="image" src="https://github.com/fpmi-hci-2023/project12-jimba/assets/79499149/57feec94-5d55-42ca-93ce-4af7758f2270">

## Presentation

[super cool link to our presentation about this project that is not suspicious at all](https://docs.google.com/presentation/d/1SHaP2K2jIwJcSeNH1wA8Vm86oeebT3n1jCt1W8l70Wg/edit?usp=sharing)

> Youre probably wondering whats here? Well basically nothing
> 
> :)
>
> or maybe a (not) good old joke
>
> When two vegans get in an argument, is it still called a beef?
