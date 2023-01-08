package com.revature.model;

public class trainerInformation {
	private String trainerId;
	private String trainerName;
	private enum trainerTrack
	{
		java,
		dotnet,
		mainframe,
		testing
	}
	private String qualification;
	private int experience;
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	
	
}
