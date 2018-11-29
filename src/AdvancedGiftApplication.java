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
