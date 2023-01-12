import java.util.ArrayList;
import java.util.List;

public class ListaFeriados {
    List<Feriado> feriados = new ArrayList<Feriado>();

    // public ListaFeriados(List<Feriado> feriados) {
    // this.feriados = feriados;
    // }

    void returnDates() {
        for (int i = 0; i < this.feriados.size(); i++) {
            System.out.println(this.feriados.get(i).getFullDate());
        }
    }

    public String searchDate(String date) {
        String[] format = date.split("/");
        int dayFormat = Integer.parseInt(format[0]);
        int monthFormat = Integer.parseInt(format[1]);

        for (int i = 0; i < this.feriados.size(); i++) {
            int elementDay = this.feriados.get(i).getDay();
            int elementMonth = this.feriados.get(i).getMonth();
            if (dayFormat == elementDay && monthFormat == elementMonth) {
                return this.feriados.get(i).getFullDate();
            }
        }

        return "Não há feriado nessa data!";
    }
}
