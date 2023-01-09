package Abstraction;

import java.io.Serializable;

public interface UserService extends CommonService, Serializable { // One interface can inherit multiple interfaces, but classes can't.

		void addUser();
		void deleteUser();
}
