package hwPracticeConstructor;

public class ConsPri01 {

    private ConsPri01(){
    }

    private static ConsPri01 pC = new ConsPri01();

    public static ConsPri01 nm(){
        return pC;
    }

}

/**To create a private constructor what we need to do is:
 *  Write the Classname
 *  But, write private before the Classname and then put ()parenthesis then put {}curly braces (line 5)
 *
 *  So:
 *  Private Classname (){} (line 5)
 *
 *  then outside that method after end curly braces (line 6) inside same class create OBJECT (line 8) by:
 *  Write the Classname
 *  But, here write private static before Classname then objectname* = new Classname ()parenthesis then put ;semicolon (line 8)
 *
 *  So:
 *  Private static Classname objectname*= new Classname(); (line 8)
 *
 *  Then we have to call for return (line 10) by:
 *  Write the Classname
 *  But, here to make it public we have to write public static before Classname objectname^(make a name) then ()Parenthesis {}curly braces (linen 10)
 *
 *  So:
 *  public static Classname objectname^ (){} (line 10)
 *
 *  then write return objectname* from private class of line 8* and end curly brace
 *
 *  So:
 *  return objectname*}
 *
 *  So the return syntax is:
 *  Public static Classname name(){     (Line 10)
 *  return objectname*}                 (Line 11)
 */
