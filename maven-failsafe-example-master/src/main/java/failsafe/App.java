package failsafe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(execute(args));
        System.exit(execute(args));
    }

    private static int execute(String[] args) {
        if (args == null) {
            return 0;
        }
        return args.length;
    }
}
