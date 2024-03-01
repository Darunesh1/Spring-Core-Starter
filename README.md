## Getting Started

This project is aimed to provide a clear view of Spring Core and its concepts like AOP, bean injection, autowiring, and etc.

1. Constructor injection
2. Spring scope
3. Lifecycle of a bean
4. Setter injection
5. Bean injection
6. Collection injection
7. Autowire byName
8. Autowire byType
9. Bean annotation
10. AOP programs
11. Before advice
12. Throws advice

When running the project, you are required to follow the command instructions. Ensure that all the necessary concepts are loaded into the project. Be careful about what to run and what to leave commented out in the relevant sections of the bean.xml file.

When running the main function in the AOP module, refer to the AOP example file. I have used an IllegalArgumentException()


## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- the folder to maintain dependencies: [To download all the required dependencies](https://drive.google.com/drive/folders/13-Y0jIW4T3D3B_PLspa_Ju-hNdt_IlG1?usp=sharing)



## Dependency Management

**Download all the dependencies and add them to the classpath before running the project.**

**To create a Java project in Visual Studio Code (VSCode), you can follow these steps:**

1. Press Ctrl + Shift + P to open the command palette.
2. Search for "Create Java Project" in the command palette.
3. Select "Create Java Project" from the options provided.
4. In the Explorer panel, you'll find the newly created Java project.
5. Inside the project, navigate to the referenced libraries or dependencies.
6. Add the required JAR files to the referenced libraries by copying them into the appropriate folder or by using any available configuration options provided by VSCode.


**To set up a Java project in IntelliJ IDEA, you can follow these steps:**

1. Open IntelliJ IDEA.
2. Go to File > New > Project.
3. Select Java from the options on the left side.
4. Choose the appropriate SDK (Java Development Kit) if prompted.
5. Click Next.
6. Specify the project name and location.
Click Finish.

Once the project is created, you can add external JAR files to it:

1. Locate the External Libraries section in the Project tool window.
2. Right-click on it and select Add as Library.
3. Choose Java if the JAR file contains Java code, or JARs or directories... if it's a generic JAR file.
4. Navigate to the location of the JAR file on your filesystem and select it.
5. Click OK or Apply to add the JAR file to your project.
