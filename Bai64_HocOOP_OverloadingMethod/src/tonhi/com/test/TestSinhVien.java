package tonhi.com.test;

import tonhi.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien nhi = new SinhVien(1,"Tố Nhi",9);
		nhi.xetTotNghiep();
		nhi.xetTotNghiep(4);
		nhi.xetTotNghiep(9, 1);
	}

}
