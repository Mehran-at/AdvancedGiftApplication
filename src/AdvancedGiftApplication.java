// Christmas is coming and Derek’s new working colleges want to organize an “invisible friend” present giving in their company.
// . Create the AdvancedGiftApplication class and write the following instructions in its main method:
// . Create the Box class that has a String called content.
// . Create an empty giftBox Optional of Box and display it.
// . Create a Box with a present name as content.
// . Assign an Optional of Box to the giftBox containing the previous Box and display it.
// . Ask if the giftBox is present and display the answer.
// . Get the value contained in giftBox and display it. To display the Box class create the toString method.
//   Hints:
//    > Use Intellij shortcuts to create the toString and equals methods.

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift:" + giftBox);
        Box boxx = new Box("Robotoy");
        Optional<Box> newBox = Optional.of(boxx);
        if (newBox.isPresent()) {
            System.out.println("There is a present in the gift box");
        }
        else System.out.println("Gift box is empty.");
        System.out.println("The gift is a " + newBox.get().toString());

    }
}
