package xyz.llamachannel;

import xyz.llamachannel.option.Option;
import xyz.llamachannel.option.Some;
import xyz.llamachannel.option.None;

/**
 * Hello world!
 *
 */
public class App {
  public static void main( String[] args ) {
    System.out.println( "Hello World!" );

    // Option<String> option1 = new Some<>("abcd");
    Option<String> option1 = new None<>();

    // System.out.println( "unwrapped = " + option1.unwrap() );

    if (option1 instanceof Some some) {
      System.out.println("instanceof Some, value = " + some.value());
    } else if (option1 instanceof None none) {
      System.out.println("instanceof None");
    }
  }
}
