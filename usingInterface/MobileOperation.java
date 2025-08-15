package usingInterface;

import java.util.List;

public interface MobileOperation {
	public int addMobile(Mobile mobile);
	public List<Mobile> viewMobiles();
	public int updateMobile(Mobile mobile);
	public int deleteMobile(int id);
	
	
}
