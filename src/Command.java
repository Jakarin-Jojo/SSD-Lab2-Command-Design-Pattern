public abstract class Command {
    private Player player;
    private int tick;

    public Command(Player player , int tick){
      this.player = player;
      this.tick = tick;
    }

    public Player getPlayer(){
        return player;
    }

    public int getTick(){
        return tick;
    }

    public abstract void execute();
}
