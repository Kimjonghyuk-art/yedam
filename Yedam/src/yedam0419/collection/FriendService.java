package yedam0419.collection;

import yedam0418.Inheritance.ex.Friend;

public interface FriendService {

	public void insert(Friend friend);
	public void update(Friend friend);
	public void delete(String name);
	public Friend select(String name);
	
}
