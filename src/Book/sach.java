package Book;
import Read.Main;
import java.io.Serializable;

public class sach implements Serializable, Main {
    private int masach,soluong;
    private String tensach,tacgia,theloai, tinhtrang;
    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }


    @Override
    public Object toObject() {
        return new Object[]{
                this.getMasach(),this.getTensach(),this.getTheloai(),this.getTacgia(), this.getSoluong(),this.getTinhtrang()
        };
    }

}

