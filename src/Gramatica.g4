grammar Gramatica;
//Gramatica analise sintatica
prog: funcoes;
funcoes: funcao*;
funcao: 'funcao' TIPO VAR '(' argumentos? ')' bloco | 'main' '(' ')' bloco;
bloco: '{' instrucoes '}'; 
argumentos: (argumento ',')*argumento;
argumento: TIPO VAR; 
instrucoes: instrocao* ;
instrocao: se | para | callFuncao ';' | decVar ';' | atribuicao ';' | retorna ';';
retorna: RETURN expressao;
se: 'se' '(' expressao ')' bloco ('senaose' '(' expressao ')' bloco)* ('naose' bloco)?;
para: 'para' '(' decVar ';' controle ';' atribuicao ')' bloco;
controle: expressao;
callFuncao: nomeFuncao  '(' parametros? ')' ;
nomeFuncao: (VAR| 'input' | 'output' | 'outputql');
parametros: (expressao ',')* expressao;
decVar: TIPO VAR ('=' expressao)?;
atribuicao: VAR ('=' | ATRIBUICOES) expressao;
expressao: expressaoVar  
         | callFuncao
         | NUMINT | NUMREAL | STRING | OP_BOOL
         | '(' expressao ')'
         | expressao OP_MUL_DIV_MOD expressao
         | expressao OP_SUM_SUB expressao
         | expressao OP expressao
         | expressao OP_LOG expressao
        ;
expressaoVar: VAR;


//Gramatica analise lexica


MAIN: 'main';

TIPO: 'inteiro'| 'real' | 'string' | 'booleano';
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
SENAOSE: 'senaose';
NAO: 'naose';
RETURN: 'retorna';
ATRI: '=';
ATRIBUICOES: '+=' | '-=';
OP_SUM_SUB: '+' | '-';
OP_MUL_DIV_MOD: '*' | '/' | '%';
OP_BOOL: 'verdade'|'falso';
OP_LOG: 'and'|'or'| 'not';
OP: '>'| '<' | '>=' | '<=' | '==' | '!=';
VAR: LETRA(DIGITO|LETRA)*;
NUMINT: DIGITO+;
NUMREAL: DIGITO+'.'DIGITO+;
STRING: '"'([^"] | '\\"' | .)*? '"';
AC: '{';
FC: '}';
DEL: ';';
COM: '##' .*?[\n\r]+ -> skip;
WS:[ \r\t\n]+ -> skip;
