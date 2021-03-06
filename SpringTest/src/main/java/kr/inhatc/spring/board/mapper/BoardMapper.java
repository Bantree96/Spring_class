package kr.inhatc.spring.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.dto.FileDto;

@Mapper
public interface BoardMapper {

	List<BoardDto> boardList();

	void boardInsert(BoardDto board);

	BoardDto boardDetail(int boardIdx);

	void boardUpdate(BoardDto board);

	void updateHit(int boardIdx);

	void boardDelete(int boardIdx);

	void boardFileInsert(List<FileDto> list);

	List<FileDto> selectBoardFileList(int boardIdx);

	FileDto selectFileInfo(int idx, int boardIdx);

}
