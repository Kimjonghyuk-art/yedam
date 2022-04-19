package yedam0419.interfaces2;

public class MySqlDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("MySql 입력처리 ");
		
	}

	@Override
	public void update() {
		System.out.println("MySql 수정처리 ");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql 삭제처리 ");
		
	}

	@Override
	public void list() {
		System.out.println("MySql 리스트처리 ");
		
	}

}
