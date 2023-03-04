package com.company;

public class Player
{
   public Variants variants;
   public String name;

  /*  public Player(Variants variants, String name)
        {
            this.variants = variants;
            this.name = name;
            System.out.println(variants + " " + name);
        }    */

    public Player(int a, String name)
    {
        setChoise(a);
        this.name = name;
    }
    public Player()
        {
            this.name = "Bot";
            int a = (int) (1 + Math.random()*3);
            setChoise(a);
            //   System.out.println(name + " " + variants + " " + a);
        }

      public String whoWins (Player firstplayer, Player secondplayer)
        {
            if(firstplayer.variants == Variants.Scissors && secondplayer.variants == Variants.Scissors)
                    System.out.println("Nichia oba vibrali: " + firstplayer.variants);
            if(firstplayer.variants == Variants.Paper && secondplayer.variants == Variants.Paper)
                System.out.println("Nichia oba vibrali: " + firstplayer.variants);
            if(firstplayer.variants == Variants.Rock && secondplayer.variants == Variants.Rock)
                System.out.println("Nichia oba vibrali: " + firstplayer.variants);

            if(firstplayer.variants == Variants.Scissors && secondplayer.variants == Variants.Paper)
                System.out.println(firstplayer.name + " Win vibrav " + firstplayer.variants + " : " +
                        secondplayer.name + " Lose vibrav " + secondplayer.variants);
            if(firstplayer.variants == Variants.Paper && secondplayer.variants == Variants.Scissors)
                System.out.println(secondplayer.name + " Win vibrav " + secondplayer.variants + " : " +
                        firstplayer.name + " Lose vibrav " + firstplayer.variants);

            if(firstplayer.variants == Variants.Rock && secondplayer.variants == Variants.Scissors)
                System.out.println(firstplayer.name + " Win vibrav " + firstplayer.variants + " : " +
                        secondplayer.name + " Lose vibrav " + secondplayer.variants);
            if(firstplayer.variants == Variants.Scissors && secondplayer.variants == Variants.Rock)
                System.out.println(secondplayer.name + " Win vibrav " + secondplayer.variants + " : " +
                        firstplayer.name + " Lose vibrav " + firstplayer.variants);

            if(firstplayer.variants == Variants.Rock && secondplayer.variants == Variants.Paper)
                System.out.println(secondplayer.name + " Win vibrav " + secondplayer.variants + " : " +
                        firstplayer.name + " Lose vibrav " + firstplayer.variants);
            if(firstplayer.variants == Variants.Paper && secondplayer.variants == Variants.Rock)
                System.out.println(firstplayer.name + " Win vibrav " + firstplayer.variants + " : " +
                        secondplayer.name + " Lose vibrav " + secondplayer.variants);


            return null;
        }

    public void setChoise(int a)
        {
            switch (a)
                {
                    case 1: this.variants = Variants.Scissors; break;
                    case 2: this.variants = Variants.Paper; break;
                    case 3: this.variants = Variants.Rock; break;
                    default:
                        System.out.println("Nevernii vvod, kak ti eto voobshe sdelal?");
                }
        }

}
