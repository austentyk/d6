public record Cards (String suit, String name, Integer value) {

  


    public String display(){
        return "Suit %s, Name %s, Value %d".formatted(suit(), name(), value());
    }
}