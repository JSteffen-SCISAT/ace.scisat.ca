class PublicationsPublicationLists(models.Model):
	id = models.AutoField(primary_key=True)
    publication = models.ForeignKey('PublicationsPublication', models.DO_NOTHING)
    list = models.ForeignKey('PublicationsList', models.DO_NOTHING)

    class Meta:
        managed = False
        db_table = 'publications_publication_lists'
        unique_together = (('publication', 'list'),)