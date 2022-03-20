public class CommandBacktoOrigin extends Command{
    private final int size;

    public CommandBacktoOrigin(Player player, int tick, int size){
        super(player,tick);
        this.size = size;
    }
    @Override
    public void execute(){
        getPlayer().setPosition(size, size);
    }
}
