class diceRoll {

    int roll() {
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }

    static void main(String[] args) {
        System.out.println("Dice Simulator.");
        diceRoll Random = new diceRoll();
        for(int i = 0 ; i < 100 ; i++){
            System.out.println(Random.roll());
        }
    }
}
