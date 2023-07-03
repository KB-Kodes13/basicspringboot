
To set up the application, begin by using the Spring Initializer and adding the necessary dependencies. Once that is done, proceed to organize the code into packages.
The controller package will handle user requests and manage the endpoints of the application. The model package will define the behavior of the data, while the repository will handle data retrieval from the CRUD operations.
In addition, create the AuthorList and BookList classes to hold the hardcoded authors and books that can be manipulated. These classes will provide the initial data for the application.

To handle the CRUD operations, the AuthorController and BookController classes should use the @GetMapping annotation to define the paths for adding, editing, and deleting books and authors. 
This ensures that the appropriate methods are executed based on user requests.

In the model package, include the Book and Author classes. These classes will contain properties such as id, title, author name, and a list of books. They will define the structure and behavior of the data within the application.

Furthermore, create the necessary HTML files for each operation, such as listing, creating, updating, and deleting. These files will be associated with the respective controller classes and rendered dynamically based on user interactions.

To run and test the application, simply open your browser and navigate to localhost:8080. Make sure to explore each functionality and verify that it works as intended, rendering the appropriate pages and performing the required operations successfully.

Following these steps will enable you to set up, run, and test the application effectively, ensuring its proper functionality and a seamless user experience.