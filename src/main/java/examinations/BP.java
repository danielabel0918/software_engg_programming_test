class MRI extends Examination {
    private String imageURL;
    private double fieldStrength;

    public MRI(LocalDate dateOfExamination, String imageURL, double fieldStrength) {
        super(dateOfExamination);
        this.imageURL = imageURL;
        this.fieldStrength = fieldStrength;
    }

    @Override
    public String getExaminationDetails() {
        return "MRI Scan Date: " + dateOfExamination.toString() +
                "\nImage URL: " + imageURL +
                "\nField Strength: " + fieldStrength + " Tesla";
    }
}

