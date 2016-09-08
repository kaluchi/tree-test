package app;

import java.util.List;

/**
 * ���� ������
 * 
 * @author Kalitko.Evgeny
 *
 */
public interface Node {

	/**
	 * @return ����������� ������������ ����, ���� null - ���� ���� �������� ������ ������
	 */
	public Node getParent();

	/**
	 * @return ������ �������� ����� ��� ������ ������, ���� ���� �������� �������� (������ ������)
	 */
	public List<Node> getChildren();
}
