grammar Gramatica;

prog: MAIN;
MAIN: 'main';

TIPO: 'inteiro'| 'real' | 'string';
AP: '(';
FP: ')';
 
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

ENTR: 'input';
SAI: 'output';
SAIQL: 'outputql';
LOOP: 'para';
FUNC: 'funcao';
COND: 'se';
SENAO: 'senaose';
NAO: 'naose';
RETURN: 'retorna';
OP_ARI: '+'|'-'|'*'|'/' | '%';
OP_BOOL: 'verdade'|'falso';
OP_LOG: 'and'|'or'| 'not';
OP: '>'| '<' | '>=' | '<=' | '==' | '!=';
ATRI: '=';
ACENT: '"'(.~'"')*'"';
VAR: LETRA(DIGITO|LETRA)*;
NUMINT: DIGITO+;
NUMREAL: DIGITO+'.'DIGITO+;
STRING: '"'([^"] | '\\"' | .)*? '"';
AC: '{';
FC: '}';
DEL: ';';
COM: '##' .*? -> skip;
WS:[ \r\t\n]+ -> skip;
