package com.example.multicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bpluse,bmin,bmul,bdiv,binv,bsqrt,bsquare,bfact,bln,blog,btan,bsin,bcos,bb1,bb2,bac,bc;
    TextView tvsec,tvmain;
    String pi ="3.14159265";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bdot=findViewById(R.id.bdot);
        bpi=findViewById(R.id.bpi);
        bequal=findViewById(R.id.bequal);
        bpluse=findViewById(R.id.bpluse);
        bmin=findViewById(R.id.bmin);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        binv=findViewById(R.id.binv);
        bsqrt=findViewById(R.id.bsqrt);
        bsquare=findViewById(R.id.bsquare);
        bfact=findViewById(R.id.bfact);
        bln=findViewById(R.id.bln);
        blog=findViewById(R.id.blog);
        btan=findViewById(R.id.btan);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);

        tvmain=findViewById(R.id.tvmain);
        tvsec=findViewById(R.id.tvsec);

        //onclick listeners
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String val=tvmain.getText().toString();
                val=val.substring(0,val.length() - 1 );
                tvmain.setText(val);
            }
        });
        bpluse .setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bmin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"*");
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String val=tvmain.getText().toString();
                double r= Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        binv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+"^"+"(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int val=Integer.parseInt(tvmain.getText().toString());
                int fact=factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double d=Double.parseDouble(tvmain.getText().toString());
                double square=d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });
    }
    //factorial function
    int factorial(int n)
    {
        return (n==1|| n==0) ? 1 :n*factorial(n-1);
    }
    //equal code
    public static double eval(final String str) {
        return new Object() {
        int pos = -1, ch;

        void nextChar() {
            ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }

        boolean eat(int charToEat) {
            while (ch == ' ') nextChar();
            if (ch == charToEat) {
                nextChar();
                return true;
            }
            return false;
        }

        double parse() {
            nextChar();
            double x = parseExpression();
            if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
            return x;
        }

        // Grammar:
        // expression = term | expression `+` term | expression `-` term
        // term = factor | term `*` factor | term `/` factor
        // factor = `+` factor | `-` factor | `(` expression `)`
        //        | number | functionName factor | factor `^` factor

        double parseExpression() {
            double x = parseTerm();
            for (;;) {
                if      (eat('+')) x += parseTerm(); // addition
                else if (eat('-')) x -= parseTerm(); // subtraction
                else return x;
            }
        }

        double parseTerm() {
            double x = parseFactor();
            for (;;) {
                if      (eat('*')) x *= parseFactor(); // multiplication
                else if (eat('/')) x /= parseFactor(); // division
                else return x;
            }
        }

        double parseFactor() {
            if (eat('+')) return parseFactor(); // unary plus
            if (eat('-')) return -parseFactor(); // unary minus

            double x;
            int startPos = this.pos;
            if (eat('(')) { // parentheses
                x = parseExpression();
                eat(')');
            } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                x = Double.parseDouble(str.substring(startPos, this.pos));
            } else if (ch >= 'a' && ch <= 'z') { // functions
                while (ch >= 'a' && ch <= 'z') nextChar();
                String func = str.substring(startPos, this.pos);
                x = parseFactor();
                if (func.equals("sqrt")) x = Math.sqrt(x);
                else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                else if (func.equals("log")) x = Math.log10(x);
                else if (func.equals("ln")) x = Math.log(x);
                else throw new RuntimeException("Unknown function: " + func);
            } else {
                throw new RuntimeException("Unexpected: " + (char)ch);
            }

            if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

            return x;
        }
    }.parse();
}
}