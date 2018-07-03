package com.project.pickplace.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
MNUM NUMBER(13,0)	No		1	�۹�ȣ
KAKAO_EMAIL	VARCHAR2(20 BYTE)	No		2	�۾���
MTITLE	VARCHAR2(30 BYTE)	No		3	����
MLOCAL	VARCHAR2(20 BYTE)	No		4	����
MCONTENT	VARCHAR2(40 BYTE)	Yes		5	�޸�
MCDATE	DATE	No	SYSDATE 	6	��ϳ�¥
MUDATE	DATE	No	SYSDATE 	7	������¥
*/

@Data // getter, setter, toString, requiredArgsConstructor(Notnull �Ķ���� ������)
@NoArgsConstructor	// �⺻ ������
public class MapInfoDTO {
	@NotNull
	private Integer mnum;	 // �۹�ȣ
	
	@NotNull
	private String kakaoEmail; // �۾���
	
	@NotNull
	private String mtitle; 	 // ����
	
	@NotNull
	private String mlocal;	 // ����
	
	private String mcontent; // �޸� 
	private Date mcdate;	 // ��ϳ�¥
	private Date mudate;	 // ������¥
	
	@NotNull 
	private String beginLat; // ��������
	
	@NotNull
	private String beginLng; // ���۰浵 
}
