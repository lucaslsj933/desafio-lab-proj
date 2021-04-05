Considerações gerais

A escolha da linguagem é deixada para você, utilize a que você se sente mais confortável. A entrada deverá ser por STDIN (standard input) e a saída por STDOUT (standard output).

Forneça as instruções de instalação e execução do seu sistema, observaremos principalmente seu design de código. Aspectos como coesão, baixo acoplamento e legibilidade são os principais pontos.

Crie um jogo baseado em turnos onde dois personagens lutam entre si. Cada personagem tem nome, pontos de energia e pontos de poder. Os pontos de energia e poder são valores numéricos inteiros.

Por exemplo, no primeiro turno o herói (o atacante da vez) ataca o inimigo (o defensor da vez) o inimigo terá seus pontos de energia diminuídos, no segundo turno o inimigo vira o atacante e o herói se transforma no defensor.

O dano sofrido, ou seja, os pontos de energia perdidos pelo inimigo, dependem do fator sorte. O fator sorte é um número aleatório de 0 a 100 que é gerado a cada turno da batalha. Há quatro tipos de ataques que dependem logicamente do fator sorte.
Fator sorte

    Quando a sorte está entre 0 e 15 o ataque é perdido e não causa dano, imprimindo "Errou - 0 HP"
    Quando a sorte está entre 16 e 70 o ataque é normal e causa 1/3 dos pontos de poder do atacante em dano, imprimindo "Normal - X HP"
    Quando a sorte está entre 71 e 96 o ataque é sorte e causa 20% a mais do que o ataque normal, imprimindo "Sorte!!! - X HP"
    Quando a sorte está entre 97 e 100 o ataque é crítico e causa o dobro de um ataque normal, imprimindo "Crítico! - X HP"

X indica o valor de dano sofrido.

O jogo segue o esquema de turnos, onde a cada turno um jogador ataca o outro. Ao fim de cada turno os papéis de atacante e defensor se alternam. O jogo acaba quando um dos personagens não tem mais energia para lutar.
Entrada

Cada personagem será informado usando o seguinte padrão: nome energia poder.

Entre a primeira personagem:
nome1 40 50
Entre a segunda personagem:
nome2 50 40

Saída

O jogo deverá produzir as seguintes saídas:

O jogo começou
Batalha entre nome1 e nome2
nome1 atacou nome2
<mensagem de dano>
nome2 atacou nome1
<mensagem de dano>
...
Jogo acabou, o vencedor foi nome1 com HP restante de Y


----------------INSTALAÇÃO----------------

1-Se não instalou Java, instale-o.

2-Extraia os arquivos

3-Mova o mouse para algum lugar vazio dentro do explorador de arquivos. Então segure Shift e clique com o botão direito do mouse.

4-Logo depois clique com o botão esquerdo do mouse em:

A: Windows 10: "Abrir a janela do Powershell aqui".
B: Windows 7: "Abrir a janela de comando aqui".

5-Copie a linha abaixo,cole e aperte enter:

java -jar desafio_lab_proj.jar
