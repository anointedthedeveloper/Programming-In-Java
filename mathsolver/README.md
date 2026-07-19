# mathsolver

Simple Java math expression evaluator demonstrating BODMAS (order of operations).

Files:

- `MathSolver.java` — core evaluator using the shunting-yard algorithm to respect operator precedence (BODMAS) and then evaluating the resulting RPN.
- `SolverDemo.java` — small interactive demo that reads expressions and prints results.

Supported features:

- Numbers with decimals (e.g. `3.14`).
- Operators: `+`, `-`, `*`, `/`, `^` (exponent).
- Parentheses `(` and `)`.
- Unary minus for negative numbers (e.g. `-5 + 3`).

Algorithm note:

The solver tokenizes the input, converts infix to postfix (RPN) via the shunting-yard algorithm which enforces BODMAS/precedence, then evaluates the postfix expression. This keeps the implementation simple and easy to extend.

Build & run (from workspace root `c:\Users\Admin\Desktop\Programming-In-Java`):

```bash
javac mathsolver\*.java
java -cp . mathsolver.SolverDemo
```

Try examples: `2+3*4`, `(1+2)^3`, `3 + 4 * 2 / (1 - 5) ^ 2 ^ 3`.
