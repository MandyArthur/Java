package thenewboston.DCComics.java; 
class Test{
public static void main (String[] args){

theLeague[] thelist = new theLeague[6];
felicitySmoak f = new felicitySmoak(); 
johnJohns j = new johnJohns(); 
karaZorEl k = new karaZorEl(); 
barryAllen b = new barryAllen(); 
dianaPrince d = new dianaPrince(); 
mariMcCabe m = new mariMcCabe(); 

thelist[0]=f; 
thelist[1]=j;
thelist[2]=k; 
thelist[3]=b;
thelist[4]=d; 
thelist[5]=m;

for (theLeague x:thelist){
    x.ability(); 
}
}}