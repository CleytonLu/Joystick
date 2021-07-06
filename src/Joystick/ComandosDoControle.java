package Joystick;

public class ComandosDoControle implements Botões{
    private boolean triangulo = false;
    private boolean bola = false;
    private boolean quadrado = false;
    private boolean xis = false;
    private boolean setaPraCima = false;
    private boolean setaDireita = false;
    private boolean setaPraBaixo = false;
    private boolean setaEsquerda = false;
    private boolean L1 = false;
    private boolean L2 = false;
    private boolean L3 = false;
    private boolean R1 = false;
    private boolean R2 = false;
    private boolean R3 = false;
    private boolean start = false;
    private boolean select = false;
    private boolean analogico = false;

    
    //Comandos de ativação

    @Override
    public void triangulo() {
        if(this.triangulo==false){
            this.triangulo=true;
            System.out.println("triangulo ativado!");
        }
        //Se o botão continar pressionado
        
        else{
            if(this.triangulo==true){
                this.triangulo=true;
                System.out.println("Trianglo continua pressionado!");
            }
        }
        this.triangulo =false;
        System.out.println("triangulo desativado!");
    }

    @Override
    public void bola() {
        if(this.bola==false){
            this.bola=true;
            System.out.println("Bola Tivado!");
        }
        //Se o botão continar pressionado
        
        else{
            if(this.bola==true){
                this.bola=true;
                System.out.println("Bola continua pressionado!");
            }
        }
        this.bola=false;
        System.out.println("Bola Desativado");
    }

    @Override
    public void quadrado() {
        if(this.quadrado==false){
            this.quadrado=true;
            System.out.println("Quadrado Ativado!");
        }
         //Se o botão continar pressionado
        
        else{
            if(this.quadrado==true){
                this.quadrado=true;
                System.out.println("Qudrado continua pressionado!");
            }
        }
        this.quadrado=false;
        System.out.println("Quadrado Desativado!");
    }

    @Override
    public void xis() {
        if(this.xis==false){
            this.xis=true;
            System.out.println("Xis Ativado!");
        }
        
         //Se o botão continar pressionado
        
        else{
            if(this.xis==true){
                this.xis=true;
                System.out.println("Xis continua pressionado!");
            }
        }
        this.xis=false;
        System.out.println("Xis Desativado");
    }

    @Override
    public void setaPraCima() {
    if(this.quadrado==false){
            this.quadrado=true;
            System.out.println("Seta Pra Cima Ativado!");
        }
    
          //Se o botão continar pressionado
    
        else{
            if(this.setaPraCima==true){
                this.setaPraCima=true;
                System.out.println("Seta Pra Cima continua pressionado!");
            }
        }
        this.quadrado=false;
        System.out.println("Seta Pra Cima Desativado");
    }
    
    @Override
    public void setaDireita() {
    if(this.setaDireita==false){
            this.setaDireita=true;
            System.out.println("Seta Direita Ativado!");
        }
        
          //Se o botão continar pressionado
    
        else{
            if(this.setaDireita==true){
                this.setaDireita=true;
                System.out.println("Seta Direita continua pressionado!");
            }
        }
        this.setaDireita=false;
        System.out.println("Seta Direita Desativado");
    }

    @Override
    public void setaPraBaixo() {
        if(this.setaPraBaixo==false){
            this.setaPraBaixo=true;
            System.out.println("Seta Pra Baixo Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.setaPraBaixo==true){
                this.setaPraBaixo=true;
                System.out.println("Seta Pra Baixo continua pressionado!");
            }
        }
        this.setaPraBaixo=false;
        System.out.println("Seta Pra Baixo Desativado!");
    }

    @Override
    public void setaEsquerda() {
        if(this.setaEsquerda==false){
            this.setaEsquerda=true;
            System.out.println("Seta Esquerda Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.setaEsquerda==true){
                this.setaEsquerda=true;
                System.out.println("Seta Esquerda continua pressionado!");
            }
        }
        this.setaEsquerda=false;
        System.out.println("Seta Esquerda Desativado!");
    }

    @Override
    public void L1() {
        if(this.L1==false){
            this.L1=true;
            System.out.println("L1 Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.L1==true){
                this.L1=true;
                System.out.println("L1 continua pressionado!");
            }
        }
        this.L1=false;
        System.out.println("L1 Desativado!");
    }

    @Override
    public void L2() {
        if(this.L2==false){
            this.L2=true;
            System.out.println("L2 Ativado!");
        }
          //Se o botão continar pressionado
        
        else{
            if(this.L2==true){
                this.L2=true;
                System.out.println("L2 continua pressionado!");
            }
        }
        this.L2=false;
        System.out.println("L2 Desativado!");
    }

    @Override
    public void L3() {
        if(this.L3==false){
            this.L3=true;
            System.out.println("L3 Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.L3==true){
                this.L3=true;
                System.out.println("L3 continua pressionado!");
            }
        }
        this.L3=false;
    }

    @Override
    public void R1() {
        if(this.R1==false){
            this.R1=true;
            System.out.println("R1 Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.R1==true){
                this.R1=true;
                System.out.println("R1 continua pressionado!");
            }
        }
        this.R1=false;
        System.out.println("R1 Desativado!");
    }

    @Override
    public void R2() {
       if(this.R2==false){
            this.R2=true;
            System.out.println("R2 Ativado!");
        }
       
         //Se o botão continar pressionado
       
        else{
            if(this.R2==true){
                this.R2=true;
                System.out.println("R2 continua pressionado!");
            }
        }
        this.R2=false;
        System.out.println("R2 Desativado!");
    }

    @Override
    public void R3() {
        if(this.R3==false){
            this.R3=true;
            System.out.println("R3 Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.R3==true){
                this.R3=true;
                System.out.println("R3 continua pressionado!");
            }
        }
        this.R3=false;
        System.out.println("R3 Desativado!");
    }

    @Override
    public void start() {
        if(this.start==false){
            this.start=true;
            System.out.println("Start Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.start==true){
                this.start=true;
                System.out.println("Start continua pressionado!");
            }
        }
        
        this.start=false;
        System.out.println("Start Desativado!");
    }

    @Override
    public void select() {
        if(this.select==false){
            this.select=true;
            System.out.println("Select Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.select==true){
                this.select=true;
                System.out.println("Select continua pressionado!");
            }
        }
        
        this.select=false;
        System.out.println("Select Desaivado!");
    }
    
    @Override
    public void analogico(){
        if(this.analogico==false){
            this.analogico = true;
            System.out.println("Analogico Ativado!");
        }
        
          //Se o botão continar pressionado
        
        else{
            if(this.analogico==true){
                this.analogico=true;
                System.out.println("Analogico continua pressionado!");
            }
        }
        
        this.analogico=false;
        System.out.println("Analogic Desativado!");
    }    
    
    
}
