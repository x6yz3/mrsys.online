package online.mrsys.movierecommender.action;

import online.mrsys.movierecommender.action.base.UserBaseAction;
import online.mrsys.movierecommender.domain.User;

public class LoginAction extends UserBaseAction {
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

}
