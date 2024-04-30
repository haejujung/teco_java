package useful.ch03;

public class NickName {

	private String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) throws NickNameException {

		if (nick == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다");
		}

		if (nick.length() < 3 && nick.length() > 10) {
			throw new NickNameException("닉네임은 4자 이상이고 10자이하이어야 합니다");
		}
		// aaaaaa --> true --> 예외 발생 됨
		// aaaa!! --> false --> 예외 발생되지 않음
		// 사용자한테 닉네임 설정시에 특수문자를 포함하여라
		// 예외 발생 하지 않게 코드를 작성한것
		if (nick.matches("[a-zA-Z0-9]+")) {
			throw new NickNameException("닉네임은 특수문자를 포함해야 합니다 ");
		}

		this.nick = nick;
	}

}
