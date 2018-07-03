package com.project.pickplace.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/*PNUM	NUMBER(13,0)	No		1	������ȣ
MNUM	NUMBER(13,0)	No		2	�Խñ۹�ȣ
PMEMO	VARCHAR2(20 BYTE)	Yes		3	�Խñ۸޸�
PTHEME	VARCHAR2(20 BYTE)	No		4	���׸�
BEGIN_LAT	VARCHAR2(30 BYTE)	No		5	��������
BEGIN_LNG	VARCHAR2(30 BYTE)	No		6	���۰浵
PIN_LAT	VARCHAR2(30 BYTE)	No		7	������
PIN_LNG	VARCHAR2(30 BYTE)	No		8	�ɰ浵
RATE	NUMBER(10,0)	Yes		9	����(RATE/2)*/


/**
 * ���õ� PIN ���� �����ͺ��̽�(PinInfo)
 */
@Data // getter, setter, toString, requiredArgsConstructor(Notnull �Ķ���͸� �����ڿ� ����)
@NoArgsConstructor	// �⺻ ������
public class PinInfoDTO {

	@NotNull
	private Integer pnum;	 // ������ȣ
	@NotNull
	private Integer mnum;	 // �Խñ۹�ȣ 
	private String pmemo;	 // �Խñ۸޸�
	@NotNull
	private String ptheme;	 // ���׸�
	@NotNull
	private String pinLat;	 // ������ 
	@NotNull
	private String pinLng;	 // �ɰ浵 
	private Integer rate;	 // ���� 
	
	/**
	 * RequiredConstructor �ϸ� ���� �ڵ� ���� �Ǿ�� �ϴµ� �� �ż� ���� ����..
	 * pnum�� ������ ��� �� �Է� ������ 
	 */
	public PinInfoDTO(@NotNull Integer mnum, String pmemo, @NotNull String ptheme, 
					  @NotNull String pinLat, @NotNull String pinLng, Integer rate) {
		super();
		this.mnum = mnum;
		this.pmemo = pmemo;
		this.ptheme = ptheme;
		this.pinLat = pinLat;
		this.pinLng = pinLng;
		this.rate = rate;
	}
	
	/**
	 * Notnull���� �����ϴ� ������
	 */
	public PinInfoDTO(@NotNull Integer mnum, @NotNull String ptheme, 
					  @NotNull String pinLat, @NotNull String pinLng) {
		super();
		this.mnum = mnum;
		this.ptheme = ptheme;
		this.pinLat = pinLat;
		this.pinLng = pinLng;
	}
}
