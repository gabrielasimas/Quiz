package gabriela.radiobutton;

import android.graphics.Color;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import static gabriela.radiobutton.R.id.radio1;

public class MainActivity extends AppCompatActivity {
    RadioButton op1;
    RadioButton op2;
    RadioButton op3;
    RadioButton op4;
    RadioButton op5;
    Button btn;
    TextView tnt;
    TextView titulo;
    TextView aviso;
    Double contador;
    Integer op = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1 = (RadioButton)findViewById(R.id.radio1);
        op2 = (RadioButton)findViewById(R.id.radio2);
        op3 = (RadioButton)findViewById(R.id.radio3);
        op4 = (RadioButton)findViewById(R.id.radio4);
        op5 = (RadioButton)findViewById(R.id.radio5);
        tnt = (TextView)findViewById(R.id.textView2);
        titulo = (TextView)findViewById(R.id.textView4);
        aviso = (TextView)findViewById(R.id.textView5);
        btn = (Button)findViewById((R.id.btn));
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onClick(View v) {
                if(op1.isChecked() || op2.isChecked() || op3.isChecked() || op4.isChecked() || op5.isChecked()) {
                    aviso.setText("");
                    if (op == 0) {
                        if (op1.isChecked()) {
                            contador = 1.00;
                            op1.setTextColor(Color.GRAY);
                        }else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                            contador = 0.00;
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                            contador = 0.00;
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                            contador = 0.00;
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                            contador = 0.00;
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if (btn.getText() == "Próximo" && op == 1) {
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 2");
                        tnt.setText("O que é o android Manifest?");
                        op1.setText("Uma classe filha");
                        op2.setText("Uma biblioteca");
                        op3.setText("Comunicador de páginas Java");
                        op4.setText("A classe principal Java");
                        op5.setText("N.D.A");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 1){
                        if (op4.isChecked()) {
                            contador = contador + 1.00;
                            op4.setTextColor(Color.GRAY);
                        }else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 2){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 3");
                        tnt.setText("O que a classe Intent permite?");
                        op1.setText("Utilizada para limpar o sistema");
                        op2.setText("Permite visualizar todos os dados");
                        op3.setText("Sair do aplicativo sem complicações");
                        op4.setText("Permite realizar requisições");
                        op5.setText("Adicionar novas bibliotecas");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 2){
                        if (op4.isChecked()) {
                            contador = contador + 1.00;
                            op4.setTextColor(Color.GRAY);
                        }else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 3){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 4");
                        tnt.setText("Java é a parte ... do projeto.");
                        op1.setText("Escrita");
                        op2.setText("Visível");
                        op3.setText("Interior");
                        op4.setText("Díficil");
                        op5.setText("Lógica");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 3){
                        if (op5.isChecked()) {
                            contador = contador + 1.00;
                            op5.setTextColor(Color.GRAY);
                        }else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                        }
                        else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 4){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 5");
                        tnt.setText("Caso o conjunto de aplicativos utilizados exceda o total de memória disponível, o sistema operacional Android irá" );
                        op1.setText("Solicitar ao usuário que termine um dos aplicativos em uso.");
                        op2.setText("Bloquear toda a execução do sistema, requerendo reinício.");
                        op3.setText("Terminar automaticamente o aplicativo de menor prioridade.");
                        op4.setText("Terminar todos os aplicativos.");
                        op5.setText("Terminar apenas o aplicativo em uso");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 4){
                        if (op3.isChecked()) {
                            contador = contador + 1.00;
                            op3.setTextColor(Color.GRAY);
                        }else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }
                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Conferir" && op == 5){
                        if (op5.isChecked()) {
                            contador = contador + 1.00;
                            op5.setTextColor(Color.GRAY);
                        }else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 5){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 6");
                        tnt.setText("O que é uma classe abstrata?");
                        op1.setText("É capaz de atribuir um comportamento diferente");
                        op2.setText("Método de programação");
                        op3.setText("Classe que cria um objeto ");
                        op4.setText("Uma ligação em que a associação de classe é feita durante a compilação");
                        op5.setText("Uma classe que não tem instâncias");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 6){
                        if (op1.isChecked()) {
                            contador = contador + 1.00;
                            op1.setTextColor(Color.GRAY);
                        }else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 6){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 7");
                        tnt.setText("O que é um construtor?");
                        op1.setText("Uma operação que cria um objeto e/ou inicializa o seu estado");
                        op2.setText("Uma operação que permite cálculos avançados");
                        op3.setText("Processo também chamado de superclasse");
                        op4.setText("É quando uma classe cria outras classes");
                        op5.setText("É o processo de estilização de um objeto");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 7){
                        if (op2.isChecked()) {
                            contador = contador + 1.00;
                            op2.setTextColor(Color.GRAY);
                        }else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 7){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 8");
                        tnt.setText("O que se entende por herança?" );
                        op1.setText("Um método público que pode ser acessado sempre.");
                        op2.setText("Um relacionamento entre classes, onde uma classe compartilha a estrutura ou o comportamento definido em outra classe.");
                        op3.setText("Uma classe compartilhada.");
                        op4.setText("Um relacionamento de decadência, onde a classe mãe é melhor.");
                        op5.setText("N.D.A");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 8){
                        if (op4.isChecked()) {
                            contador = contador + 1.00;
                            op4.setTextColor(Color.GRAY);
                        }else if (op2.isChecked()) {
                            op2.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }

                        btn.setText("Próximo");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 8){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 9");
                        tnt.setText("A linguagem Java foi, originalmente, desenvolvida para?");
                        op1.setText("Permitir a comunicação entre aparelhos domésticos e computadores");
                        op2.setText("Traduzir fórmulas matemáticas utilizando-se cartões perfurados");
                        op3.setText("Processar valores inteiros, em um ambiente negócios, em computadores de grande porte");
                        op4.setText("Trabalhar com inteligência artificial por meio de uma abordagem puramente lógica");
                        op5.setText("Demonstrar a viabilidade da implementação da álgebra relacional de dados");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Conferir" && op == 9){
                        if (op2.isChecked()) {
                            contador = contador + 1.00;
                            op2.setTextColor(Color.GRAY);
                        }else if (op1.isChecked()) {
                            op1.setTextColor(Color.RED);
                        }
                        else if (op3.isChecked()) {
                            op3.setTextColor(Color.RED);
                        }
                        else if (op4.isChecked()) {
                            op4.setTextColor(Color.RED);
                        }
                        else if (op5.isChecked()) {
                            op5.setTextColor(Color.RED);
                        }

                        btn.setText("Obter Resultado");
                        btn.setTextColor(Color.BLACK);
                        op++;
                    }
                    else if(btn.getText() == "Próximo" && op == 9){
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        op5.setChecked(false);
                        op1.setTextColor(Color.BLACK);
                        op2.setTextColor(Color.BLACK);
                        op3.setTextColor(Color.BLACK);
                        op4.setTextColor(Color.BLACK);
                        op5.setTextColor(Color.BLACK);
                        titulo.setText("Questão 10");
                        tnt.setText("Durante o desenvolvimento de uma aplicação orientada a objetos com Java, um Técnico criou uma interface para obrigar um conjunto de classes de diferentes origens a implementar certos métodos de maneiras diferentes, viabilizando a obtenção de");
                        op1.setText("Abstração");
                        op2.setText("Polimorfismo");
                        op3.setText("Métodos");
                        op4.setText("Herança");
                        op5.setText("N.D.A");
                        btn.setText("Conferir");
                    }
                    else if(btn.getText() == "Obter Resultado" && op == 10) {
                        titulo.setText("Resultado");
                        op1.setVisibility(View.GONE);
                        op2.setVisibility(View.GONE);
                        op3.setVisibility(View.GONE);
                        op4.setVisibility(View.GONE);
                        op5.setVisibility(View.GONE);
                        btn.setVisibility(View.GONE);
                        if (contador == 0.00) {
                            tnt.setText("Infelizmente, você não acertou nenhuma questão.");
                        } else {
                            Double porcentagem = (contador / 10.00) * 100.00;
                            DecimalFormat number = new DecimalFormat("#.00");
                            tnt.setText("Porcentagem: " + String.valueOf(number.format(porcentagem)) + "%  Quantidade de Acertos: " + contador);
                        }
                    }
                }else{
                    aviso.setText("É necessário selecionar uma resposta antes de avançar.");
                }


            }
        }
        );


    }
}
