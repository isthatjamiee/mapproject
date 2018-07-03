package com.project.pickplace.dao;

import java.util.List;

import com.project.pickplace.dto.PinInfoDTO;


// PinInfo �����ͺ��̽��� ���� ���� �޼ҵ� DAO 
public interface PinDAO {
	// �� ���
	void insert(PinInfoDTO pindto);
	
	/**
	 * ��ü �� ��� ��������
	 * @return List<PinInfoDTO> list;
	 */
	List<PinInfoDTO> pinList();
	
	/** 
	 * �ش� ID, �ش� MapInfo�� �ش� �ϴ� �� ��� �������� 
	 * @param kakaoEmail : īī�� �̸���
	 * @param mnum : �� �ѹ�
	 * @return List<PinInfoDTO> list;
	 */
	List<PinInfoDTO> pinList(String kakaoEmail, String mnum);
	
	// �� ����
	
	// �� ����
}
