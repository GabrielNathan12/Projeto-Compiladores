grammar Gramatica;


MAIN: 'main';

TIPO: 'int'| 'real' | 'string';
AP: '(';
FP: ')';

ENTR: 'input';
SAI: 'output';
SAIQL: 'outputql';


OP_ARI: '+'|'-'|'*'|'/';
OP_LOG: 'and'|'or'| 'not';
OP: '>'| '<' | '>=' | '<=' | '==' | '=';

VAR: LETRA((DIGITO|LETRA)+)?;
NUM: DIGITO+('.' DIGITO)?;


LOOP: 'para';
FUNC: 'funcao';
COND: 'se';
SENAO: 'senaose';
NAO: 'naose';
RETURN: 'retorna';

AC: '{';
FC: '}';
DEL: ';';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

WS:[ \r\t\n\'##'] ->skip;