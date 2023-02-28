package by.itacademy.lecture20.strategy.command;

public class ExitCommand extends Command{

    @Override
    public void execute() {
        System.out.println("Выход");
    }
}
