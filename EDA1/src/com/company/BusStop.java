package com.company;


public class BusStop{


public ArrayQueue<BusData> fila = new ArrayQueue<>(10);

int pessoas = 0;
int TempoAutocarro;


public void chega_grupo(int horas, int minutos, int grupo) {
    BusData busdata = new BusData(horas, minutos, grupo);
  fila.enqueue(busdata);
  pessoas = pessoas + grupo;

System.out.println("Hora " + busdata.getHora() + ":" + busdata.getMinuto() + " " + grupo + " pessoas chegam, ficam " + pessoas + " na fila");
}

public void chegada_bus(int horas, int minutos, int vagas) {
   int grupo;
   int TempoAutocarro = horas * 60 + minutos;
   int TempoEspera = 0;
   int i = 0;



    System.out.println("Chega Bus -> " + horas + ":" + minutos + " há " + vagas + " vagas no bus");
   if(fila.empty()){
       i=1;
       System.out.println("The queue is empty");
   }else {
       while(vagas!=0 && !fila.empty()){
       grupo=fila.front().getGroap();
       TempoEspera = TempoEspera + TempoAutocarro - fila.front().getHora()*60 - fila.front().getMinuto();
       if(grupo <= vagas){
           System.out.println("Hora " + fila.front().getHora() + ":" + fila.front().getMinuto() + " chegaram " + grupo + " ficam " + 0);
           vagas = vagas - grupo;
           pessoas = pessoas - grupo;
           fila.dequeue();
       } else {

           fila.front().setGroap(grupo-vagas);
           pessoas = pessoas - vagas;
           vagas = 0;
           System.out.println("Hora " + fila.front().getHora() + ":" + fila.front().getMinuto() + " chegaram " + grupo + " ficam " + fila.front().getGroap());
           //print
       }
       i=i+1;
   }}
    int TempoMedioEspera = TempoEspera/i;
   System.out.println("Tempo médio de espera: " + TempoMedioEspera + " minutos");
   //print
}


}

