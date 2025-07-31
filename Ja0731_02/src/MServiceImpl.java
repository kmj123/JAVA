
public class MServiceImpl implements MService {

	@Override
	public void selectAll() {
		System.out.println("게시글 전체룰력");
	}

	@Override
	public void selectOne() {
		System.out.println("게시글 1개 출력");
		
	}

	@Override
	public void update() {
		System.out.println("게시글 1개 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("게시글 1개 삭제");
		
	}

}
