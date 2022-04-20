package yedam0419.collection;

import java.util.ArrayList;

import yedam0418.Inheritance.ex.Friend;
import yedam0418.Inheritance.ex.Gender;

public interface FriendService {

	final int INSERT = 1;
	final int UPDATE = 2;
	final int DELETE = 3;
	final int SELECT = 4;
	public void insert(Friend friend);
	public void update(Friend friend);
	public void delete(String name);
	public Friend select(String name);
	public ArrayList<Friend> findGender(Gender gender);
}
