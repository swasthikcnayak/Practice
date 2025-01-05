import java.util.HashMap;
import java.util.Map;

/**
 * Interpretor design pattern helps to evaluate the expression type of problems
 * Usually used in combination with the composite pattern
 * 
 * 
 */

// context forms the reference where we store the mapping of the expression to
// the true values
class Context {
    Map<String, Integer> map = new HashMap<>();

    Context(Map<String, Integer> map) {
        this.map = new HashMap<>();
    }

    public void setValue(String key, int value) {
        map.put(key, value);
    }

    public int getValue(String key) {
        return map.get(key);
    }
}

interface Expression {
    public int evaluate(Context context) throws Exception;
}

class TerminalExpression {
    String key;

    public TerminalExpression(String key) {
        this.key = key;
    }

    public int evaluate(Context context) {
        return context.getValue(key);
    }
}

class NonTerminalExpression implements Expression {
    Expression left, right;
    String operator;

    public NonTerminalExpression(Expression left, Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public int evaluate(Context context) throws Exception{
        if(operator.equals("+")){
            return left.evaluate(context) + right.evaluate(context);
        }else if(operator.equals("-")){
            return left.evaluate(context) - right.evaluate(context);
        }else if(operator.equals("*")){
            return left.evaluate(context) * right.evaluate(context);
        }
        throw new Exception("Not supported");
    }
}