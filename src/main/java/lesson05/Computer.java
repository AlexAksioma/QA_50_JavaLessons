package lesson05;

public class Computer {
    private String company;
    private int ram;
    private String cpu;
    private int ssd;

    public Computer() {
    }

    public Computer(String company, int ram, String cpu, int ssd) {
        //this.company = company;
        setCompany(company);
        //this.ram = ram;
        setRam(ram);
        //this.cpu = cpu;
        setCpu(cpu);
        //this.ssd = ssd;
        setSsd(ssd);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null)    //____    isEmpty() ""
            this.company = company;
        else
            this.company = "default";
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 0)
            this.ram = ram;
        else
            this.ram = 2;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        if (cpu != null)
            this.cpu = cpu;
        else
            this.cpu = "cpu";
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        if (ssd > 0)
            this.ssd = ssd;
        else
            this.ssd = 128;
    }

    @Override
    public String toString() {
        return  "company='" + company + '\'' +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", ssd=" + ssd
                ;
    }
}
