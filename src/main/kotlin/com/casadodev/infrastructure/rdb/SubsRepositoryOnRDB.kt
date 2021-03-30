package com.casadodev.infrastructure.rdb

import com.casadodev.domain.entities.SubsEntity
import com.casadodev.domain.repositories.SubsRepository
import io.micronaut.transaction.annotation.ReadOnly
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.TypedQuery
import javax.transaction.Transactional
import kotlin.streams.toList


@Singleton
open class SubsRepositoryOnRDB(
    private val entityManager: EntityManager,
) : SubsRepository {

    private val logger: Logger = LoggerFactory.getLogger(SubsRepositoryOnRDB::class.java)

    @Transactional
    override fun save(entity: SubsEntity): SubsEntity? {
        logger.info("Método save sub")
        entityManager.persist(entity)
        return entity
    }

    //TODO: ver sobre "JPQL" Query
    @ReadOnly
    override fun findAll(): List<SubsEntity>? {
        logger.info("Método find all")
        val query: TypedQuery<SubsEntity> = entityManager.createQuery(
            "SELECT s FROM SubsEntity s order by s.id",
            SubsEntity::class.java
        )
        return query.resultStream.toList()
    }
}