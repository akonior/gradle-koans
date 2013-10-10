package pl.warsjawa;

public class Hello {

    String message = "Hello message";

    String getMessage() {

        // uncommet to see pmd check fail
        //try {
        //    throw new RuntimeException();
        //} catch(RuntimeException e) {
        //}

        return message;
    }
}
