Scenario: Creating related families of products, such as Button and Checkbox for different operating systems (e.g., Windows and Mac).

Step 1: Define Product Interfaces

// Button.java
public interface Button {
    void paint();
}

// Checkbox.java
public interface Checkbox {
    void paint();
}

---------------------------
Step 2: Create Concrete Products for Each Family

  // WindowsButton.java
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}

// MacButton.java
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac button.");
    }
}

// WindowsCheckbox.java
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}

// MacCheckbox.java
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac checkbox.");
    }
}
-----------------------------------------------------

  Step 3: Define the Abstract Factory Interface

  // GUIFactory.java
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
--------------------------------------------------------

  Step 4: Implement Concrete Factories
  // WindowsFactory.java
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// MacFactory.java
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
--------------------------------------------------------

  Step 5: Client Code
  // AbstractFactoryDemo.java
public class AbstractFactoryDemo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS: " + osName);
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

// Application.java
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
-------------------------------------------------------
