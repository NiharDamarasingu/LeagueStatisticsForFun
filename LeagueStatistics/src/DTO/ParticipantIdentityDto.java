package DTO;

public class ParticipantIdentityDto {
	
	private PlayerDto player;
	private int participantId;
	public PlayerDto getPlayer() {
		return player;
	}
	public void setPlayer(PlayerDto player) {
		this.player = player;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	
	

}
