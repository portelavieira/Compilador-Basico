
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\003\003\000\002\004\004\000\002\004\011" +
    "\000\002\004\007\000\002\004\005\000\002\004\006\000" +
    "\002\004\004\000\002\006\004\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\016\004\016\006\004\020\005\022\014\024" +
    "\011\025\007\001\002\000\004\022\052\001\002\000\016" +
    "\004\016\006\004\020\005\022\014\024\011\025\007\001" +
    "\002\000\022\002\ufffe\004\ufffe\006\ufffe\020\ufffe\021\ufffe" +
    "\022\ufffe\024\ufffe\025\ufffe\001\002\000\016\010\ufff0\011" +
    "\ufff0\012\ufff0\013\ufff0\016\ufff0\023\ufff0\001\002\000\004" +
    "\002\047\001\002\000\020\010\ufff1\011\ufff1\012\ufff1\013" +
    "\ufff1\014\043\016\ufff1\024\044\001\002\000\014\010\023" +
    "\011\024\012\026\013\025\016\042\001\002\000\020\002" +
    "\001\004\016\006\004\020\005\022\014\024\011\025\007" +
    "\001\002\000\010\022\014\024\020\025\007\001\002\000" +
    "\004\016\036\001\002\000\004\022\017\001\002\000\010" +
    "\022\014\024\020\025\007\001\002\000\016\010\ufff1\011" +
    "\ufff1\012\ufff1\013\ufff1\016\ufff1\023\ufff1\001\002\000\014" +
    "\010\023\011\024\012\026\013\025\023\022\001\002\000" +
    "\016\004\016\006\004\020\005\022\014\024\011\025\007" +
    "\001\002\000\010\022\014\024\020\025\007\001\002\000" +
    "\010\022\014\024\020\025\007\001\002\000\010\022\014" +
    "\024\020\025\007\001\002\000\010\022\014\024\020\025" +
    "\007\001\002\000\016\010\ufff4\011\ufff4\012\ufff4\013\ufff4" +
    "\016\ufff4\023\ufff4\001\002\000\016\010\ufff3\011\ufff3\012" +
    "\ufff3\013\ufff3\016\ufff3\023\ufff3\001\002\000\016\010\ufff5" +
    "\011\ufff5\012\026\013\025\016\ufff5\023\ufff5\001\002\000" +
    "\016\010\ufff6\011\ufff6\012\026\013\025\016\ufff6\023\ufff6" +
    "\001\002\000\004\005\034\001\002\000\016\004\016\006" +
    "\004\020\005\022\014\024\011\025\007\001\002\000\024" +
    "\002\ufffc\004\ufffc\005\ufffc\006\ufffc\020\ufffc\021\ufffc\022" +
    "\ufffc\024\ufffc\025\ufffc\001\002\000\024\002\ufffd\004\ufffd" +
    "\005\ufffd\006\ufffd\020\ufffd\021\ufffd\022\ufffd\024\ufffd\025" +
    "\ufffd\001\002\000\014\010\023\011\024\012\026\013\025" +
    "\023\040\001\002\000\016\010\ufff2\011\ufff2\012\ufff2\013" +
    "\ufff2\016\ufff2\023\ufff2\001\002\000\022\002\uffff\004\uffff" +
    "\006\uffff\020\uffff\021\uffff\022\uffff\024\uffff\025\uffff\001" +
    "\002\000\024\002\ufff8\004\ufff8\005\ufff8\006\ufff8\020\ufff8" +
    "\021\ufff8\022\ufff8\024\ufff8\025\ufff8\001\002\000\010\022" +
    "\014\024\020\025\007\001\002\000\004\016\ufff7\001\002" +
    "\000\014\010\023\011\024\012\026\013\025\016\046\001" +
    "\002\000\024\002\ufff9\004\ufff9\005\ufff9\006\ufff9\020\ufff9" +
    "\021\ufff9\022\ufff9\024\ufff9\025\ufff9\001\002\000\004\002" +
    "\000\001\002\000\020\004\016\006\004\020\005\021\051" +
    "\022\014\024\011\025\007\001\002\000\024\002\ufffa\004" +
    "\ufffa\005\ufffa\006\ufffa\020\ufffa\021\ufffa\022\ufffa\024\ufffa" +
    "\025\ufffa\001\002\000\010\022\014\024\020\025\007\001" +
    "\002\000\014\010\023\011\024\012\026\013\025\023\054" +
    "\001\002\000\016\004\016\006\004\020\005\022\014\024" +
    "\011\025\007\001\002\000\024\002\ufffb\004\ufffb\005\ufffb" +
    "\006\ufffb\020\ufffb\021\ufffb\022\ufffb\024\ufffb\025\ufffb\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\014\002\007\003\012\004\005\005\011\006" +
    "\014\001\001\000\002\001\001\000\012\003\047\004\005" +
    "\005\011\006\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\004\040\005\011\006\014\001\001\000\004\005" +
    "\036\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\020\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\004\032\005\011\006\014\001\001\000\004\005\031" +
    "\001\001\000\004\005\030\001\001\000\004\005\027\001" +
    "\001\000\004\005\026\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\004\034\005\011\006\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\044" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\004\040\005\011\006\014" +
    "\001\001\000\002\001\001\000\004\005\052\001\001\000" +
    "\002\001\001\000\010\004\054\005\011\006\014\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return s.next_token(); 
    }


    scanner s;
    parser(scanner s) { this.s = s; }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // prog ::= stmt_list 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt_list ::= stmt_list stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt_list ::= stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt ::= var_decl SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= KW_IF LPAREN expr RPAREN stmt KW_ELSE stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= KW_WHILE LPAREN expr RPAREN stmt 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= LBRACE stmt_list RBRACE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= IDENTIFIER EQ expr SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= expr SEMI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // var_decl ::= IDENTIFIER IDENTIFIER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var_decl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr PLUS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr MINUS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr TIMES expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr DIV expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= LPAREN expr RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= NUMBER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
