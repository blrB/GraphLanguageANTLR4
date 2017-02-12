grammar GraphExpr;

NOT : '!';

AND : '&&';
OR : '||';
EQ : '==';
NEQ : '!=';

GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';

ASSIGN : '=';
SCOL : ';';

OPAR : '(';
CPAR : ')';

OBRACE : '{';
CBRACE : '}';

OSQBRACE : '[';
CSQBRACE : ']';

TRUE : 'true';
FALSE : 'false';
NULL : 'null';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOREACH : 'forEach';
PRINT : 'print';

PUSH : '<-';
PULL : '->';
CONTAIN : '<?>';

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | foreach_stat
 | print
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR expr CPAR stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : WHILE condition_block
 ;

foreach_stat
 : FOREACH condition_block
 ;

print
 : PRINT expr SCOL
 ;

expr
 : MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 | expr op=(PUSH | PULL) expr           #pushAndPullGraphExpr
 | expr CONTAIN expr                    #containGraphExpr
 | graph_atom                           #atomGraphExpr
 ;

graph_atom
 : GRAPH          #graphAtom
 | VERTEX         #vertexAtom
 | EDGE           #edgeAtom
 ;

atom
 : OPAR expr CPAR #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NULL           #nullAtom
 ;

GRAPH
 : 'graph' OPAR STRING CPAR
 ;

VERTEX
 : 'vertex' OPAR STRING CPAR
 ;

EDGE
 : 'edge' LT ID ',' ID GT
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : .
 ;