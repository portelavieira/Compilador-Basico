
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java.util.List;
import java.util.ArrayList;
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
    "\000\026\000\002\002\004\000\002\002\005\000\002\002" +
    "\004\000\002\003\004\000\002\003\011\000\002\003\007" +
    "\000\002\003\003\000\002\003\003\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\005\000\002\004" +
    "\005\000\002\004\005\000\002\004\003\000\002\004\003" +
    "\000\002\005\003\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\024\003\010\013\016\021\020\023\004\024" +
    "\013\025\017\026\007\027\012\030\006\001\002\000\004" +
    "\013\056\001\002\000\004\004\055\001\002\000\030\004" +
    "\ufff0\005\ufff0\006\ufff0\007\ufff0\010\ufff0\014\ufff0\015\ufff0" +
    "\016\ufff0\017\ufff0\020\ufff0\022\ufff0\001\002\000\004\027" +
    "\uffec\001\002\000\006\004\ufffa\022\ufffa\001\002\000\004" +
    "\027\054\001\002\000\030\004\uffef\005\uffef\006\uffef\007" +
    "\uffef\010\uffef\014\uffef\015\uffef\016\uffef\017\uffef\020\uffef" +
    "\022\uffef\001\002\000\004\027\uffee\001\002\000\026\004" +
    "\ufffb\005\025\006\023\007\032\010\027\015\026\016\024" +
    "\017\030\020\033\022\ufffb\001\002\000\026\002\052\003" +
    "\010\013\016\021\020\023\004\024\013\025\017\026\007" +
    "\027\012\030\006\001\002\000\010\013\016\027\012\030" +
    "\006\001\002\000\004\027\uffed\001\002\000\004\013\021" +
    "\001\002\000\010\013\016\027\012\030\006\001\002\000" +
    "\024\005\025\006\023\007\032\010\027\014\031\015\026" +
    "\016\024\017\030\020\033\001\002\000\010\013\016\027" +
    "\012\030\006\001\002\000\010\013\016\027\012\030\006" +
    "\001\002\000\010\013\016\027\012\030\006\001\002\000" +
    "\010\013\016\027\012\030\006\001\002\000\010\013\016" +
    "\027\012\030\006\001\002\000\010\013\016\027\012\030" +
    "\006\001\002\000\024\003\010\013\016\021\020\023\004" +
    "\024\013\025\017\026\007\027\012\030\006\001\002\000" +
    "\010\013\016\027\012\030\006\001\002\000\010\013\016" +
    "\027\012\030\006\001\002\000\030\004\ufff2\005\ufff2\006" +
    "\ufff2\007\ufff2\010\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2" +
    "\020\ufff2\022\ufff2\001\002\000\030\004\ufff7\005\ufff7\006" +
    "\ufff7\007\ufff7\010\ufff7\014\ufff7\015\026\016\024\017\030" +
    "\020\033\022\ufff7\001\002\000\004\022\037\001\002\000" +
    "\024\003\010\013\016\021\020\023\004\024\013\025\017" +
    "\026\007\027\012\030\006\001\002\000\006\004\ufffd\022" +
    "\ufffd\001\002\000\030\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3\022" +
    "\ufff3\001\002\000\030\004\ufff6\005\ufff6\006\ufff6\007\ufff6" +
    "\010\ufff6\014\ufff6\015\026\016\024\017\030\020\033\022" +
    "\ufff6\001\002\000\030\004\ufff5\005\ufff5\006\ufff5\007\ufff5" +
    "\010\ufff5\014\ufff5\015\ufff5\016\ufff5\017\ufff5\020\ufff5\022" +
    "\ufff5\001\002\000\030\004\ufff9\005\ufff9\006\ufff9\007\032" +
    "\010\027\014\ufff9\015\026\016\024\017\030\020\033\022" +
    "\ufff9\001\002\000\030\004\ufff4\005\ufff4\006\ufff4\007\ufff4" +
    "\010\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4\022" +
    "\ufff4\001\002\000\030\004\ufff8\005\ufff8\006\ufff8\007\032" +
    "\010\027\014\ufff8\015\026\016\024\017\030\020\033\022" +
    "\ufff8\001\002\000\024\005\025\006\023\007\032\010\027" +
    "\014\050\015\026\016\024\017\030\020\033\001\002\000" +
    "\030\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\014\ufff1" +
    "\015\ufff1\016\ufff1\017\ufff1\020\ufff1\022\ufff1\001\002\000" +
    "\004\004\053\001\002\000\004\002\001\001\002\000\026" +
    "\002\000\003\000\013\000\021\000\023\000\024\000\025" +
    "\000\026\000\027\000\030\000\001\002\000\006\004\ufffe" +
    "\022\ufffe\001\002\000\026\002\uffff\003\uffff\013\uffff\021" +
    "\uffff\023\uffff\024\uffff\025\uffff\026\uffff\027\uffff\030\uffff" +
    "\001\002\000\010\013\016\027\012\030\006\001\002\000" +
    "\024\005\025\006\023\007\032\010\027\014\060\015\026" +
    "\016\024\017\030\020\033\001\002\000\024\003\010\013" +
    "\016\021\020\023\004\024\013\025\017\026\007\027\012" +
    "\030\006\001\002\000\006\004\ufffc\022\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\012\002\014\003\004\004\013\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\003\050\004\013\005\010\001\001\000\004\004\046\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\021" +
    "\001\001\000\002\001\001\000\004\004\045\001\001\000" +
    "\004\004\044\001\001\000\004\004\043\001\001\000\004" +
    "\004\042\001\001\000\004\004\041\001\001\000\004\004" +
    "\040\001\001\000\010\003\035\004\013\005\010\001\001" +
    "\000\004\004\034\001\001\000\004\004\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\003\037\004\013\005\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\056\001\001\000\002\001\001\000\010\003\060" +
    "\004\013\005\010\001\001\000\002\001\001" });

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
  public int start_production() {return 0;}

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


    Scanner s;
    parser(Scanner s) { this.s = s; }

    List<String> createNode(String label, List<String>... children) {
        List<String> node = new ArrayList<>();
        node.add(label);
        for (List<String> child : children) {
            if (child != null) {
                node.addAll(child);
            }
        }
        return node;
    }


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
          case 0: // $START ::= stmt_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<String> start_val = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // stmt_list ::= stmt_list stmt SEMI 
            {
              List<String> RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> s = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<String> e = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = createNode("stmt_list", s, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stmt_list ::= stmt SEMI 
            {
              List<String> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<String> e = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = createNode("stmt_list", e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stmt ::= type IDENTIFIER 
            {
              List<String> RESULT =null;
		int typleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int typright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String typ = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("Declaração de variável: " + typ + " " + id.value); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stmt ::= KW_IF LPAREN expr RPAREN stmt KW_ELSE stmt 
            {
              List<String> RESULT =null;
		int condleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		List<String> cond = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int if_stmtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int if_stmtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> if_stmt = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int else_stmtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int else_stmtright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> else_stmt = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("IF/ELSE Statement", cond, if_stmt, else_stmt); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stmt ::= KW_WHILE LPAREN expr RPAREN stmt 
            {
              List<String> RESULT =null;
		int condleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> cond = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bodyleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bodyright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> body = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("WHILE Loop", cond, body); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmt ::= expr 
            {
              List<String> RESULT =null;
		int expressionleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expressionright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> expression = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("Expressão", expression); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmt ::= error 
            {
              List<String> RESULT =null;
		 System.err.println("Erro de sintaxe em: " + s.next_token().value); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr PLUS expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("+", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr MINUS expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("-", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr TIMES expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("*", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr DIV expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("/", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr EQ expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("==", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr NEQ expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("!=", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr GT expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode(">", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr LT expr 
            {
              List<String> RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<String> e1 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<String> e2 = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("<", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= LPAREN expr RPAREN 
            {
              List<String> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<String> e = (List<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= NUMBER 
            {
              List<String> RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("Número: " + ((String)n)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= IDENTIFIER 
            {
              List<String> RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = createNode("Identificador: " + ((String)id)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // type ::= KW_INT 
            {
              String RESULT =null;
		 RESULT = "int"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // type ::= KW_FLOAT 
            {
              String RESULT =null;
		 RESULT = "float"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // type ::= KW_STRING 
            {
              String RESULT =null;
		 RESULT = "string"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
