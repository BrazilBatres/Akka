package demo;
import akka.actor.typed.ActorSystem;
public class App 
{
    public static void main( String[] args )
    {
        final ActorSystem<HelloWorldMain.SayHello> system = ActorSystem.create(HelloWorldMain.create(), "Hello");
        system.tell(new HelloWorldMain.SayHello("World"));
        system.tell(new HelloWorldMain.SayHello("Akka"));

    }
}
