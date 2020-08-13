require 'graphql_java_gen'
require 'graphql_schema'
require 'json'

schemaFile = File.read(ARGV[0])
schema = GraphQLSchema.new(JSON.parse(schemaFile))

GraphQLJavaGen.new(schema,
  package_name: "de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings",
  nest_under: 'Schema', # Not used, but must be defined
  custom_scalars: [
    GraphQLJavaGen::Scalar.new(
      type_name: 'TimeSpan',
      java_type: 'Integer',
      deserialize_expr: ->(expr) { "jsonAsInteger(#{expr}, key)" },
    ),
    GraphQLJavaGen::Scalar.new(
      type_name: 'Date',
      java_type: 'Date',
      deserialize_expr: ->(expr) { "Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(#{expr}, key))))" },
      imports: ['java.util.Date', 'java.time.format.DateTimeFormatter', 'java.time.temporal.TemporalAccessor', 'java.time.Instant']
    ),
  ]
).save_granular(ARGV[1])
